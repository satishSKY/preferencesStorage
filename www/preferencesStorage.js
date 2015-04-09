	
	   window.getAll = function(callback) {
	        cordova.exec(callback, function(err) {
	            callback('Nothing to echo.');
	        }, "PreferencesStorage", "getAll", []);
	    };
	    window.getAll(function(echoValue) {
	       console.log(echoValue); // should alert true.
	    });
	

	    
	    
	    window.storeMsg = function(keyValue,callback) {
	        cordova.exec(callback, function(err) {
	            callback('Nothing to echo.');
	        }, "PreferencesStorage", "storeMsg", keyValue);
	    };
	    /*   window.storeMsg( ["userName","sky"],function(echoValue) {
        alert(echoValue); // should alert true.
    });*/
	    
	    
	    window.getMsgByKey = function(key ,callback) {
	        cordova.exec(callback, function(err) {
	            callback('Nothing to echo.');
	        }, "PreferencesStorage", "getMsg", [key]);
	    };
	   /* window.getMsgByKey( "userName",function(echoValue) {
	        alert(echoValue); // should alert true.
	    });*/
	    
	    
	    window.removeMsgByKey = function(key,callback) {
	        cordova.exec(callback, function(err) {
	            callback('Nothing to echo.');
	        }, "PreferencesStorage", "removeMsg", [key]);
	    };
	/*    window.removeMsgByKey("userName", function(echoValue) {
	        alert(echoValue); // should alert true.
	    });
	*/
	    window.removeAll = function(callback) {
	        cordova.exec(callback, function(err) {
	            callback('Nothing to echo.');
	        }, "PreferencesStorage", "removeAll", [key]);
	    };
	   /* window.removeAll( function(echoValue) {
	        alert(echoValue); // should alert true.
	    });*/
	   	

