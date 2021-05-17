
//验证添加书籍  书籍名、作者、出版社、出版日期不能为空  开始
function creatNewBook() {
	var Name = $("#Name").val();
	var Author = $("#Author").val();
	var publish = $("#publish").val();
	var publishdate = $("#publishdate").val();
	var Page = $("#Page").val();
	var Price = $("#Price").val();
	var Content = $("#Content").val();
	
	if(Name.length==0){
		$("#msgN").html("书名不能为空！");
	}
	if(Author.length==0){
		$("#msgA").html("作者不能为空！");updateBook()
	}
	if(publish.length==0){
		$("#msgP").html("出版社不能为空！");
	}
	if(publishdate.length==0){
		$("#msgPD").html("出版日期不能为空！");
	}
}
//验证添加书籍  书籍名、作者、出版社、出版日期不能为空  结束


//验证修改书籍  书籍名、作者、出版社、出版日期不能为空  开始
function updateBook() {
	var Name = $("#Name").val();
	var Author = $("#Author").val();
	var publish = $("#publish").val();
	var publishdate = $("#publishdate").val();
	var Page = $("#Page").val();
	var Price = $("#Price").val();
	var Content = $("#Content").val();
	
	if(Name.length==0){
		$("#msgN").html("书名不能为空！");
	}
	if(Author.length==0){
		$("#msgA").html("作者不能为空！");
	}
	if(publish.length==0){
		$("#msgP").html("出版社不能为空！");
	}
	if(publishdate.length==0){
		$("#msgPD").html("出版日期不能为空！");
	}
}

//验证修改书籍  书籍名、作者、出版社、出版日期不能为空  结束


