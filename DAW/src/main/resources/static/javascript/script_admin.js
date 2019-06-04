$('a.nav-link').on('click',function(){
    
    alert("hola");
    $('a.nav-link .activo').removeClass('activo');
    $(this).addClass('activo');
    
    
})