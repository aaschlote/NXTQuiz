$('a.edit-modal-cliente').on('click', function() {
    var myModal = $('#editar-orcamento');
    var id = $(this).data('id');
    var cliente = $(this).data('cliente');
    var date = $(this).data('date');
    var urgencia = $(this).data('urgencia');
    var tradutor = $(this).data('tradutor');
    var valor = $(this).data('valor');
    var status = $(this).data('status');
    var observacao = $(this).data('observacao');
    var especialidade = $(this).data('especialidade');
    var original = $(this).data('original');
    
    if(valor == "0.0"){
    	valor = "Sem valor";
    }
    
    if (status == "Novo"){
    	$('.modal-body #btn-cancelar', myModal ).removeClass( "hidden" )
    	$('.modal-body #btn-aprovar', myModal ).addClass( "hidden" )
    }else if (status == "Aguardando Aprovacao"){
    	$('.modal-body #btn-cancelar', myModal ).removeClass( "hidden" )
    	$('.modal-body #btn-aprovar', myModal ).removeClass( "hidden" )
    }else if (status == "Cancelado"){
    	$('.modal-body #btn-cancelar', myModal ).addClass( "hidden" )
    	$('.modal-body #btn-aprovar', myModal ).addClass( "hidden" )
    }else if (status == "Aprovado"){
    	$('.modal-body #btn-cancelar', myModal ).addClass( "hidden" )
    	$('.modal-body #btn-aprovar', myModal ).addClass( "hidden" )
    }
    
    if(urgencia == 1){
    	urgencia = "Alta";
    }else if(urgencia == 2){
    	urgencia = "Media";
    }else if(urgencia == 3){
    	urgencia = "Baixa";
    }
    
    $('.modal-header #h4', myModal).text(id + " - " + especialidade);
    $('.modal-body #modal-id', myModal).val(id);
    $('.modal-body #modal-data', myModal).val(date);
    $('.modal-body #modal-status', myModal).val(status);
    $('.modal-body #modal-urgencia', myModal).val(urgencia);
    $('.modal-body #modal-tradutor', myModal).val(tradutor);
    $('.modal-body #modal-observacao', myModal).val(observacao);
    $('.modal-body #modal-valor', myModal).val(valor);
    $('.modal-body #modal-doc-original', myModal).attr("href","download.jsp?doc="+original).attr('target','_blank');

    myModal.modal({ show: true });
    return false;
});

$('a.edit-modal-cliente-pedido').on('click', function() {
	var myModal = $('#editar-pedido');
	var avaliarModal = $('#modal-avaliar');
    var id = $(this).data('id');
    var documento = $(this).data('documento');
    var tradutor = $(this).data('tradutor');
    var date = $(this).data('date');
    var status = $(this).data('status');
    var observacao = $(this).data('observacao')
    var documentoOriginal = $(this).data('original');
    var documentoTraduzido = $(this).data('traduzido');
    
    if (status == "Em Andamento"){
    	$('.modal-body #modal-doc-original', myModal ).removeClass( "hidden" )
    	$('.modal-body #modal-doc-traduzido', myModal ).addClass( "hidden" )
    	$('.modal-body #modal-avaliar-tradutor', myModal ).addClass( "hidden" )

    }else if (status == "Enviado"){
    	$('.modal-body #modal-doc-original', myModal ).removeClass( "hidden" )
    	$('.modal-body #modal-doc-traduzido', myModal ).removeClass( "hidden" )
    	$('.modal-body #modal-avaliar-tradutor', myModal ).removeClass( "hidden" )

    }else if (status == "Finalizado"){
    	$('.modal-body #modal-doc-original', myModal ).removeClass( "hidden" )
    	$('.modal-body #modal-doc-traduzido', myModal ).removeClass( "hidden" )
    	$('.modal-body #modal-avaliar-tradutor', myModal ).addClass( "hidden" )
    }
    
    $('.modal-body #modal-id-pedido', avaliarModal).val(id);
    $('.modal-body #modal-nome-tradutor', avaliarModal).val(tradutor);
    
    $('.modal-header #h4', myModal).text(id + " - " + documento);
    $('.modal-body #modal-tradutor', myModal).val(tradutor);
    $('.modal-body #modal-id', myModal).val(id);
    $('.modal-body #modal-data', myModal).val(date);
    $('.modal-body #modal-status', myModal).val(status);
    $('.modal-body #modal-observacao', myModal).val(observacao);
    $('.modal-body #modal-doc-original', myModal).attr("href", "download.jsp?doc="+documentoOriginal).attr('target','_blank');
    $('.modal-body #modal-doc-traduzido', myModal).attr("href", "download.jsp?doc="+documentoTraduzido).attr('target','_blank');
    
	myModal.modal({ show: true });
    return false;
});

$('a.edit-modal-tradudor-pedido').on('click', function() {
	var myModal = $('#editar-pedido');
    var id = $(this).data('id');
    var cliente = $(this).data('cliente');
    var date = $(this).data('date');
    var status = $(this).data('status');
    var observacao = $(this).data('observacao')
    var original = $(this).data('original');
    var traduzido = $(this).data('traduzido');
    
    if (status == "Em Andamento"){
    	$('.modal-body #btn-enviar-traducao', myModal ).removeClass( "hidden" )
    	$('.modal-body #modal-doc-traduzido', myModal ).addClass( "hidden" )

    }else if (status == "Enviado"){
    	$('.modal-body #btn-enviar-traducao', myModal ).addClass( "hidden" )
    	$('.modal-body #modal-doc-traduzido', myModal ).removeClass( "hidden" )

    }else if (status == "Finalizado"){
    	$('.modal-body #btn-enviar-traducao', myModal ).addClass( "hidden" )
    	$('.modal-body #modal-doc-traduzido', myModal ).removeClass( "hidden" )
    }
    
    $('.modal-header #h4', myModal).text(id + " - " + cliente);
    $('.modal-body #modal-id', myModal).val(id);
    $('.modal-body #modal-data', myModal).val(date);
    $('.modal-body #modal-status', myModal).val(status);
    $('.modal-body #modal-observacao', myModal).val(observacao);
    $('.modal-body #modal-doc-original', myModal).attr("href", "download.jsp?doc="+original).attr('target','_blank');
    $('.modal-body #modal-doc-traduzido', myModal).attr("href", "download.jsp?doc="+traduzido).attr('target','_blank');
    
	myModal.modal({ show: true });
    return false;
});

$('a.edit-modal-tradutor').on('click', function() {
    var myModal = $('#editar-orcamento');
    var id = $(this).data('id');
    var cliente = $(this).data('cliente');
    var date = $(this).data('date');
    var prioridade = $(this).data('prioridade');
    var valor = $(this).data('valor');
    var status = $(this).data('status');
    var observacao = $(this).data('observacao');
    var especialidade = $(this).data('especialidade');
    var original = $(this).data('original');
    
    if(valor == "0.0"){
    	valor = "Sem valor";
    }
    
    if (status == "Novo"){
    	$('.modal-body #btn-enviar', myModal ).removeClass( "hidden" )

    }else if (status == "Aguardando Aprovacao"){
    	$('.modal-body #btn-enviar', myModal ).addClass( "hidden" )

    }else if (status == "Cancelado"){
    	$('.modal-body #btn-enviar', myModal ).addClass( "hidden" )

    }else if (status == "Aprovado"){
    	$('.modal-body #btn-enviar', myModal ).addClass( "hidden" )

    }
    
    if(prioridade == 1){
    	prioridade = "Alta";
    }else if(prioridade == 2){
    	prioridade = "Media";
    }else if(prioridade == 3){
    	prioridade = "Baixa";
    }
    
    $('.modal-header #h4', myModal).text(id + " - " + cliente);
    $('.modal-body #modal-id', myModal).val(id);
    $('.modal-body #modal-data', myModal).val(date);
    $('.modal-body #modal-status', myModal).val(status);
    $('.modal-body #modal-urgencia', myModal).val(prioridade);
    $('.modal-body #modal-observacao', myModal).val(observacao);
    $('.modal-body #modal-valor', myModal).val(valor);
    $('.modal-body #modal-doc-original', myModal).attr("href", "download.jsp?doc="+original).attr('target','_blank');

    myModal.modal({ show: true });
    return false;
});