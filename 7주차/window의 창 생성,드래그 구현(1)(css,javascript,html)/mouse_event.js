window.onload = function(){
	//getElementById로 가져오는 부분은 생략가능. css 셀렉터에 설정한 id 이름과 사용할 이름이 동일하면 생략가능			.
	var windows = document.getElementById('windows');
	//var explorer = document.getElementById('explorer');
	var start_button = document.getElementById('start_button');
	var power_button = document.getElementById('power_button');
	//var bar = document.getElementById('bar');


	//windows 바탕화면 키고 끄기
	function power_button_MyHandler() {
		
	}
	power_button_MyHandler.prototype.handleEvent = function(e) {
		var windows_state = false;	//windows 의 구동여부

		return function() {
			if(windows_state===false) {
				windows.style.display='block';
				start_button.addEventListener("click", start_button_handlerInstance, false);	//windows 의 시작 버튼 리스너 등록
				windows_state = true;
			}else {
				windows.style.display='none';
				//explorer.style.display='none';
				start_button.removeEventListener("click", start_button_handlerInstance, false);	//windows 의 시작 버튼 리스너 해제
				windows_state = false;
			}
		};
		
	}();
	var power_button_handlerInstance = new power_button_MyHandler();


	//windows 의 시작 버튼
	function start_button_MyHandler() {
	}
	start_button_MyHandler.prototype.count = 1;	//창 위치의 우선순위를 저장하는 변수. 모든 창이 공유하도록 prototype에 선언.
	start_button_MyHandler.prototype.handleEvent = function(e) {
		//explorer 의 종료 버튼
		function exit_button_MyHandler() {
		}
		exit_button_MyHandler.prototype.handleEvent = function(e) {
			objDIV.style.display='none';
		};
		var exit_button_handlerInstance = new exit_button_MyHandler();

		//bar를 클릭 후 드래그 할시
		function dragstart_MyHandler() {
		}
		dragstart_MyHandler.prototype.handleEvent = function(e) {
			e.preventDefault();					//이벤트가 발생시에는 기타 기본이벤트는 무시.
			var box = objDIV.getBoundingClientRect();		//객체의 offset 기준으로 top,left,width,height를 반환
			var w = box.width || (box.right - box.left);
			var h = box.height || (box.bottom - box.top);
			//var startX = e.offsetX;
			//var startY = e.offsetY;
			var drag_handlerInstance = function(event) {
				objDIV.style.left = -(e.screenX - event.screenX)+box.left+(w/2);		//드래그 x좌표
				objDIV.style.top = -(e.screenY - event.screenY)+box.top+(h/2);			//드래그 y좌표
				/*
				explorer.style.left = event.offsetX +(w/2) - startX;
				explorer.style.top = event.offsetY + (h/2) - startY;
				*/
			
			};
			var dragend_handlerInstance = function() {
				window.removeEventListener("mousemove", drag_handlerInstance, false);		//mouseup 발생시 mousemove리스너 삭제
			};
			window.addEventListener("mousemove", drag_handlerInstance, false);		//전역에서 동작하는 mousemove 리스너 등록
			window.addEventListener("mouseup", dragend_handlerInstance, false);		//전역에서 동작하는 mouseup 리스너 등록
		};
		var dragstart_handlerInstance = new dragstart_MyHandler();

		//창의 우선순위를 정해주는 함수
		var z_index = function(){
			++start_button_MyHandler.prototype.count;
			objDIV.style.zIndex=start_button_MyHandler.prototype.count;
		};

		//explorer div 동적 생성
		var objDIV = document.createElement("div");	//div생성
		document.body.appendChild(objDIV);		//div배치(document.body의 자식으로)
		objDIV.setAttribute('id', 'explorer');		//div의 id 설정. css셀렉터가 캐치가능
		objDIV.style.display='block';			//생성되자마자 창을 볼 수 있도록 설정
		objDIV.style.zIndex= start_button_MyHandler.prototype.count++;			//생성된 창위치의 우선순위 설정

		//var div 동적 생성
		var bar = document.createElement("div");
		objDIV.appendChild(bar);
		bar.setAttribute('id', 'bar');

		//창종료버튼 div 동적 생성
		var exit_button = document.createElement("div");
		objDIV.appendChild(exit_button);
		exit_button.setAttribute('id', 'exit_button');


		bar.addEventListener("mousedown", dragstart_handlerInstance, false);		//bar 드래그 리스너 등록
		exit_button.addEventListener("click", exit_button_handlerInstance, false);	//종료버튼 리스너 등록
		objDIV.addEventListener("mousedown", z_index, false);				//창위치 우선순위 리스너 등록
		//explorer.style.display='block';
	};
	var start_button_handlerInstance = new start_button_MyHandler();



	//파워버튼과 시작버튼 리스너 등록
	if(document.addEventListener) {		<!-- addEventListener를 지원하는 브라우저의 경우 -->
		power_button.addEventListener("click", power_button_handlerInstance, false);
		//start_button.addEventListener("click", start_button_handlerInstance, false);
		//exit_button.addEventListener("click", exit_button_handlerInstance, false);
		//bar.addEventListener("mousedown", dragstart_handlerInstance, false);
	}else if(document.attachEvent) {	<!-- attachEvent를 지원하는 브라우저의 경우 -->
		power_button.attachEvent('onclick', power_button_handlerInstance);
		start_button.attachEvent('onclick', start_button_handlerInstance);
		//exit_button.attachEvent('onclick', exit_button_handlerInstance);
	}else {					<!-- 둘다 지원 안하는 브라우저의 경우 -->
		power_button.onclick = power_button_handlerInstance;
		start_button.onclick = start_button_handlerInstance;
		//exit_button.onclick = exit_button_handlerInstance;
	}
};