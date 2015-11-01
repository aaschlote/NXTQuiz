$(document).ready(function(){
    $("select").change(function(){
        $( "select option:selected").each(function(){           
            if($(this).attr("value")=="pf"){
            	$('#c-cnpj').removeAttr('required');
            	$('#c-razao-social').removeAttr('required');
            	
            	$('#field-razao-social').addClass('hide');
                $('#field-cnpj').addClass('hide');
            	
                $('#field-cpf').removeClass('hide');
                $('#field-rg').removeClass('hide');
                $('#field-nascimento').removeClass('hide');
                
            	$('#c-cpf').addAttr('required');
            	$('#c-rg').addAttr('required');
            	$('#c-nascimento').addAttr('required');

            }else if($(this).attr("value")=="pj"){
            	
            	$('#c-cpf').removeAttr('required');
            	$('#c-rg').removeAttr('required');
            	$('#c-nascimento').removeAttr('required');
            	
                $('#field-cpf').addClass('hide');
                $('#field-rg').addClass('hide');
                $('#field-nascimento').addClass('hide');
                
                $('#field-razao-social').removeClass('hide');
                $('#field-cnpj').removeClass('hide');
                
            	$('#c-cnpj').addAttr('required');
            	$('#c-razao-social').addAttr('required');
            }
        });
    }).change();
});

