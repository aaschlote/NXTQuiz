window.onload = function() { 
	document.getElementById('loading').style.display='none';
	if (document.getElementById('gameover').value == 'true') {
		document.getElementById('showModal').click();
	}
}

$('a.pagina-desafio').on('click', function() {
	var id = $(this).data('id');
	
	$.ajax({
        url: "nxtAceitaDesafio",
        type: 'POST',
        data: {'id-desafio' : id},
        success: function (data) { 
        	location.href='telaPerguntas.jsp?idDesafio='+id;
        	return false;
        },
        error:function(data,status,er) {
            alert("error: "+data+" status: "+status+" er:"+er);
        }
    });
	
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
	
	document.getElementById('loading').style.display='block';
	document.getElementById('errormsg').style.display='none';
	
	return false;
});


$('#encerra').on('click', function (e) {

	$.ajax({
        url: "nxtEncerrarDesafio",
        type: 'POST',
        success: function (data) { 
        	location.href='index.jsp';
        	return false;
        },
        error:function(data,status,er) {
            alert("error: "+data+" status: "+status+" er:"+er);
        }
    });

})