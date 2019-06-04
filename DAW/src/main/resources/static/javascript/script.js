$(document).ready(function(){

    $('.nav').on('click','li',function(){
        
        $(".active").removeClass('active');
        $(this).addClass('active');
        
        
    });
    
    $('.borde-l-registro').on('click',function(){
       
        $('.login').css('display','inline');
        $(this).removeClass('text-danger');
        $(this).addClass('text-white');
        $('a.borde-r-registro').removeClass('text-danger');
        $('a.borde-r-registro').addClass('text-dark');
        $('.borde-l-registro').css('background-color','#dc3545');
        
    });
    
    $('#cierra-login').on('click',function(){
        
        $('.login').css('display','none');
        $('.borde-l-registro').addClass('text-danger');
        $('.borde-l-registro').css('background-color','#fff');
    })
    
//    $('.btn#admin').on('click',function(){
//        
////      Falta validar datos acceso 
//
// 
//     location.href="admin/clientes.php";
//   
// 
//        
//    })
    
    $('a.borde-r-registro').on('click',function(){
        
        
        $('a.borde-l-registro').removeClass('text-danger');
        $('a.borde-l-registro').addClass('text-dark');
        $(this).removeClass('text-dark');
        $(this).addClass('text-danger');
        
    })
    
  
})
                  