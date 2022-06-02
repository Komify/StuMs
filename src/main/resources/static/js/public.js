function getRootPath() {
    return "http://localhost:8080/web";
}
/**********************************************
 * ajax数据处理
 * params:参数对象
 * type:数据处理类别
 * callback:回调函数
 * mask:数据交互是否使用遮罩，true表示使用,不填或false表示使用
 *********************************************/
function doData(url,params,callback,mask) {
    url=getRootPath()+"/"+url;//增加项目的根地址
    $.ajax({
        type : 'post',
        url : url,
        dataType: 'json',
        contentType: "application/json; charset=utf-8",
        cache:true,
        data: JSON.stringify(params),
        beforeSend: function(){
            if (mask!=undefined && mask==true && $("#mask")!=undefined && $("#mask").length>0)
            {
                $("#mask").css("height",$(document).height());
                $("#mask").css("width",$(document).width());
                $("#mask img").css("padding-top",window.innerHeight*0.45);
                $("#mask").show();
            }
        },
        complete:function (xhr, status) {
            if (mask!=undefined && mask==true && $("#mask").length>0)
                $("#mask").hide();
        },
        success: function (data, textStatus, request) {
            if (mask!=undefined && mask==true && $("#mask").length>0)
                $("#mask").hide();
            if (callback) callback(data);
        },
        error : function(arg0,arg1,arg2) {
            switch(arg0.status)
            {
                case 200:
                    alert("服务器已经接收到您的请求，但无法做出正确的响应，请联系管理员进行处理，问题发生地址：" + url);
                    break;
                case 404:
                    alert("当前操作的资源不存在，请联系管理员！");
                    break;
                case 500:
                    alert("程序内容处理错误：500,内部符号"+url);
                    break;
                default:
                    alert("数据处理错误,错误代码："+arg0.status);
                    break;
            }
        }
    });
}
/**********************************************
 * ajax数据处理
 * params:参数对象
 * type:数据处理类别
 * callback:回调函数
 * mask:数据交互是否使用遮罩，true表示使用,不填或false表示使用
 *********************************************/
function doDataAll(url,params,callback,mask) {
    $.ajax({
        type : 'post',
        url : url,
        dataType: 'json',
        contentType: "application/json; charset=utf-8",
        cache:true,
        xhrFields: {
            withCredentials: true
        },
        data: JSON.stringify(params),
        beforeSend: function(){
            if (mask!=undefined && mask==true && $("#mask").length>0)
            {
                $("#mask").css("height",$(document).height());
                $("#mask").css("width",$(document).width());
                $("#mask img").css("padding-top",window.innerHeight*0.45);
                $("#mask").show();
            }
        },
        complete:function () {
            if (mask!=undefined && mask==true && $("#mask").length>0)
                $("#mask").hide();
        },
        success: function (data) {
            if (mask!=undefined && mask==true && $("#mask").length>0)
                $("#mask").hide();
            if (callback) callback(data);
        },
        error : function(arg0,arg1,arg2) {
            switch(arg0.status)
            {
                case 200:
                    alert("服务器已经接收到您的请求，但无法做出正确的响应，请联系管理员进行处理，问题发生地址：" + url);
                    break;
                case 404:
                    alert("当前操作的资源不存在，请联系管理员！");
                    break;
                case 500:
                    alert("程序内容处理错误：500,内部符号"+url);
                    break;
                default:
                    alert("数据处理错误,错误代码："+arg0.status);
                    break;
            }
        }
    });
}

/**********************************************
 * ajax数据处理
 * params:参数对象
 * type:数据处理类别
 * callback:回调函数
 * mask:数据交互是否使用遮罩，true表示使用,不填或false表示使用
 *********************************************/
function doDataAllAsync(url,params,callback,mask) {
    $.ajax({
        type : 'post',
        url : url,
        async: false,
        dataType: 'json',
        xhrFields: {
            withCredentials: true
        },
        contentType: "application/json; charset=utf-8",
        cache:true,
        data: JSON.stringify(params),
        beforeSend: function(){
            if (mask!=undefined && mask==true && $("#mask").length>0)
            {
                $("#mask").css("height",$(document).height());
                $("#mask").css("width",$(document).width());
                $("#mask img").css("padding-top",window.innerHeight*0.45);
                $("#mask").show();
            }
        },
        complete:function () {
            if (mask!=undefined && mask==true && $("#mask").length>0)
                $("#mask").hide();
        },
        success: function (data) {
            if (mask!=undefined && mask==true && $("#mask").length>0)
                $("#mask").hide();
            if (callback) callback(data);
        },
        error : function(arg0,arg1,arg2) {
            switch(arg0.status)
            {
                case 200:
                    alert("服务器已经接收到您的请求，但无法做出正确的响应，请联系管理员进行处理，问题发生地址：" + url);
                    break;
                case 404:
                    alert("当前操作的资源不存在，请联系管理员！");
                    break;
                case 500:
                    alert("程序内容处理错误：500,内部符号"+url);
                    break;
                default:
                    alert("数据处理错误,错误代码："+arg0.status);
                    break;
            }
        }
    });
}
function doAjax(url,params,callback,mask) {
    $.ajax({
        type : 'post',
        url : url,
        dataType: 'json',
        contentType: "application/json; charset=utf-8",
        cache:true,
        xhrFields: {
            withCredentials: true
        },
        data: JSON.stringify(params),
        beforeSend: function(){
            if (mask!=undefined && mask==true && $("#mask").length>0)
            {
                $("#mask").css("height",$(document).height());
                $("#mask").css("width",$(document).width());
                $("#mask img").css("padding-top",window.innerHeight*0.45);
                $("#mask").show();
            }
        },
        complete:function () {
            if (mask!=undefined && mask==true && $("#mask").length>0)
                $("#mask").hide();
        },
        success: function (data) {
            if (mask!=undefined && mask==true && $("#mask").length>0)
                $("#mask").hide();
            if (callback) callback(data);
        },
        error : function(arg0,arg1,arg2) {
            switch(arg0.status)
            {
                case 200:
                    alert("服务器已经接收到您的请求，但无法做出正确的响应，请联系管理员进行处理，问题发生地址：" + url);
                    break;
                case 404:
                    alert("当前操作的资源不存在，请联系管理员！");
                    break;
                case 500:
                    alert("程序内容处理错误：500,内部符号"+url);
                    break;
                default:
                    alert("数据处理错误,错误代码："+arg0.status);
                    break;
            }
        }
    });
}

/**********************************************
 * ajax数据处理
 * params:参数对象
 * type:数据处理类别
 * callback:回调函数
 *********************************************/
function doDataAsync(url,params,callback,mask) {
    url=getRootPath()+"/"+url;//增加项目的根地址
    $.ajax({
        headers:{'Content-Type':'application/json;charset=utf8','token':sessionStorage.getItem("token")},
        type : 'post',
        url : url,
        async: false,
        dataType: 'json',
        xhrFields: {
            withCredentials: true
        },
        contentType: "application/json; charset=utf-8",
        cache:true,
        data: JSON.stringify(params),
        beforeSend: function(){
            if (mask!=undefined && mask==true && $("#mask").length>0)
            {
                $("#mask").css("height",$(document).height());
                $("#mask").css("width",$(document).width());
                $("#mask img").css("padding-top",window.innerHeight*0.45);
                $("#mask").show();
            }
        },
        complete:function () {
            if (mask!=undefined && mask==true && $("#mask").length>0)
                $("#mask").hide();
        },
        success: function (data) {
            if (mask!=undefined && mask==true && $("#mask").length>0)
                $("#mask").hide();
            if (callback) callback(data);
        },
        error : function(arg0,arg1,arg2) {
            switch(arg0.status)
            {
                case 200:
                    alert("服务器已经接收到您的请求，但无法做出正确的响应，请联系管理员进行处理，问题发生地址：" + url);
                    break;
                case 404:
                    alert("当前操作的资源不存在，请联系管理员！");
                    break;
                case 500:
                    alert("程序内容处理错误：500,内部符号"+url);
                    break;
                default:
                    alert("数据处理错误,错误代码："+arg0.status);
                    break;
            }
        }
    });
}

