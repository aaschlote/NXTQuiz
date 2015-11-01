$(document).on('change', '.btn-file :file', function() {
  var input = $(this),
      numFiles = input.get(0).files ? input.get(0).files.length : 1,
      label = input.val().replace(/\\/g, '/').replace(/.*\//, '');
  input.trigger('fileselect', [numFiles, label]);
});

$(document).ready( function() {
    $('.btn-file :file').on('fileselect', function(event, numFiles, label) {
        
        var input = $(this).parents('.input-group').find(':text'),
            log = numFiles > 1 ? numFiles + ' files selected' : label;
        
        if( input.length ) {
            input.val(log);
        } else {
            if( log ) alert(log);
        }
        
    });
    
    $("button[name='addIdioma']").click(function(e) {
    	$("#div-idioma-especialidade").clone().appendTo("#idioma-especialidade-comentario")
    	$("#div-comentario").clone().appendTo("#idioma-especialidade-comentario")
    });
		
	$("button[name='addDocumentos']").click(function(e) {
		
	});
});


function validarSolicitacaoOrcamento(param){

	if(document.getElementById("idioma-traducao").value == ""){
		alert('Favor informar um idioma para tradução');
		document.getElementById("idioma-traducao").focus();
		return;
	}
	
	if(document.getElementById("idioma-original").value == ""){
		alert('Favor informar o idioma do documento');
		document.getElementById("idioma-original").focus();
		return;
	}
	
	if(document.getElementById("arquivo").value == ""){
		alert('Favor informar um documento');
		document.getElementById("arquivo").focus();
		return;
	}
	
	document.forms["orcamento"].submit();
}

function pesquisaTradutor(){
	var tradutor = $("#tradutorPesquisa").val();
	var idioma= $("#idiomaPesquisa").val();
	
	$.ajax({
        url: "pesquisa-tradutor.jsp",
        type: 'POST',
        data: {'tradutor' : tradutor, 'idioma' : idioma},
        success: function (data) { 
           if(data){
        	   $("#resultadoPesquisaTradutor").html(data);
           }else{
        	   $("#resultadoPesquisaTradutor").html("Nenhum informação encontrada");
           }
        },
        error:function(data,status,er) {
            alert("error: "+data+" status: "+status+" er:"+er);
        },
        complete:function(){
        	return;
        }
    });
}

function pesquisaTradutorOrcamento(){
	var tradutor = $("#tradutorPesquisaOrcamento").val();
	
	$.ajax({
        url: "pesquisa-tradutor-orcamento.jsp",
        type: 'POST',
        data: {'tradutor' : tradutor, 'idioma' : 1},
        success: function (data) { 
           if(data){
        	   $("#PesquisaTradutorOrcamento").html(data);
           }else{
        	   $("#PesquisaTradutorOrcamento").html("Nenhum informação encontrada");
           }
        },
        error:function(data,status,er) {
            alert("error: "+data+" status: "+status+" er:"+er);
        },
        complete:function(){
        	return;
        }
    });
}

function selecionaTradutor(id, nome){
	$("#tradutor").val(nome);
	$("#idtradutor").val(id);
	$("#pesquisa-tradutor-orcamento").modal('hide');
}
