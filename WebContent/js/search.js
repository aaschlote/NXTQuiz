$(function () {       
    $('#lista-servicos-tradutor').searchable({
        searchField: '#busca-servicos-tradutor',
        selector: 'li',
        childSelector: '.servico',
        show: function( elem ) {
            elem.slideDown(100);
        },
        hide: function( elem ) {
            elem.slideUp( 100 );
        }
    })
});
