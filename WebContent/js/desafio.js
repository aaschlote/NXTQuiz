$('a.pagina-desafio').on('click', function() {
	var id = $(this).data('id');
	
	location.href='telaPerguntas.jsp?idDesafio='+id;
	
	return false;
});

$('a.opcao-pergunta').on('click', function() {
	var idDesafio = $(this).data('id-desafio');
	var idPergunta = $(this).data('id-pergunta');
	var respostaCerta = $(this).data('resposta-certa');
	
	$.ajax({
        url: "nxtValidaProximaPergunta",
        type: 'POST',
        data: {'resposta-certa' : respostaCerta, 'id-pergunta' : idPergunta},
        success: function (data) { 
        	location.href='telaPerguntas.jsp?idDesafio='+idDesafio;
        	return false;
        },
        error:function(data,status,er) {
            alert("error: "+data+" status: "+status+" er:"+er);
        }
    });
	
	return false;
});
