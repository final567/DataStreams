(function($){

    var zIndex_count = 1;

    //Attach this new method to jQuery
    //jQuery로 신규 함수를 추가한다.

    $.fn.extend({ 
        //This is where you write your plugin's name
        //요기가 플러그인 이름을 정의하는곳이다.(pluginname)

        dialog: function(options) {
 
    		
            //Iterate over the current set of matched elements
            //현재 매치된 엘리먼트들의 반복 작업 부분 
    		return this.each(function() {
                //code to be inserted here
                //작업 코드는 여기에 넣으면 됨
        		if(options==="open") {
        			this.style.display='block';
        		}
        		else if(options==="close") {
        			this.style.display='none';
        		}else {
                    this.style.display='block';
                };

            });
        },

    	appendDiv: function(setClass) {
                //Iterate over the current set of matched elements
                //현재 매치된 엘리먼트들의 반복 작업 부분
            return this.each(function() {
                //code to be inserted here
                //작업 코드는 여기에 넣어주심됨

                //드래그 구현에 필요한 변수들
                var moveX, moveY, gapX, gapY,objX, objY;
                var isMouseDown = false;

                //explorer생성 후 그안에 bar 와 exit_button 생성
        		var objDIV = $('<div></div>').appendTo($(document.body)).addClass(setClass);	//.setAttribute('class', setClass) 는 작동 안함.
        		var bar = $('<div></div>').appendTo(objDIV).addClass('bar');
        		var exit_button = $('<div></div>').appendTo(objDIV).addClass('exit_button');

                //초기 zIndex 설정
        		objDIV.css("zIndex", ++zIndex_count);

                //exit_button 기능 구현
        		exit_button.click(function(){
        			objDIV.css('display', 'none');	//.style.display='none' 는 작동 안함.
        		});

         		
                // **** getBoundingClientRect()명령어 안먹음 ****
        		//var box = objDIV.getBoundingClientRect();		//객체의 offset 기준으로 top,left,width,height를 반환
        		//var w = box.width || (box.right - box.left);
        		//var h = box.height || (box.bottom - box.top);
        		
                //드래그 구현(1) - 마우스 다운 이벤트시 현재 마우스 좌표와 객체의 좌표 구하기
        		bar.mousedown(function(e) {
        			$(document.body).css("cursor", "move");
        			isMouseDown = true;
        			//alert("눌렀습니다."); 

        			gapX = e.pageX;
        			gapY = e.pageY;

                    objX = objDIV.offset().left;
                    objY = objDIV.offset().top;

                    e.preventDefault(); //이벤트가 발생시에는 기타 기본이벤트는 무시.

                    //드래그 구현(2) - 마우스 업 이벤트시 드래그 이벤트 종료
            		$(document.body).on( 'mouseup.dialog',function() {
            			$(document.body).css("cursor", "default");
            			isMouseDown = false;
            			//alert("떼었습니다.");
                        $(this).off('mouseup.dialog').off('mousemove.dialog');
            		});

                    //드래그 구현(3) - 마우스 다운 이벤트 후 마우스 이동 이벤트 발생 시 (마우스다운시 좌표에서 변한값 + 객체왠래위치 + margin값)
            		$(document.body).on('mousemove.dialog',function(e) {
            			if(isMouseDown){
            				moveX = -(gapX - e.pageX)+objX+(400/2);
            				moveY = -(gapY - e.pageY)+objY+(300/2);
            				objDIV.css("left", moveX + "px");
            				objDIV.css("top", moveY + "px");
            				//alert(this.screenX);
            			}
            		});
                });

                //zIndex 설정 부분
        		objDIV.mousedown(function(){
        			objDIV.css("zIndex", ++zIndex_count);
        		});

                /*
                //좌표 테스트
                $(document.body).click(function(e) {
                    alert("e.pageX "+e.pageX+", e.pageY "+e.pageY+"\n"+
                            "e.clientX "+e.clientX+", e.clientY "+e.clientY+"\n"+
                            "e.screenX "+e.screenX+", e.screenY "+e.screenY+"\n"+
                            "objX "+objDIV.offset().left+", objY "+objDIV.offset().top+"\n"); 
                });
                */
            });
        }

    });
//pass jQuery to the function, 
//So that we will able to use any valid Javascript variable name 
//to replace "$" SIGN. But, we'll stick to $ (I like dollar sign: ) )       
})(jQuery);



/*
    pluginname: function() {
 
            //Iterate over the current set of matched elements
            //현재 매치된 엘리먼트들의 반복 작업 부분 
            return this.each(function() {
             
                //code to be inserted here
                //작업 코드는 여기에 넣어주심됨 
             
            });
        }
*/