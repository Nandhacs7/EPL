$(document).ready(function(){
		/*$("#clk_icon").hover(function(){
			$("#menu_list_bg p").show();
		},function(){}
		);*/
		
		$('#clk_icon').mouseover(function(){
		$('#menu_list_bg').slideToggle();
		});
		
		$('#menu_list_bg').mouseleave(function(){
		$('#menu_list_bg').hide();
		});

	});