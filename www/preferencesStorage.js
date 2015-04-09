	
	   window.getAll = function(callback) {
	        cordova.exec(callback, function(err) {
	            callback('Nothing to echo.');
	        }, "PreferencesStorage", "getAll", []);
	    };
	  
	

	    
	    
	    window.storeMsg = function(keyValue,callback) {
	        cordova.exec(callback, function(err) {
	            callback('Nothing to echo.');
	        }, "PreferencesStorage", "storeMsg", keyValue);
	    };
	 
	    
	    
	    window.getMsgByKey = function(key ,callback) {
	        cordova.exec(callback, function(err) {
	            callback('Nothing to echo.');
	        }, "PreferencesStorage", "getMsg", [key]);
	    };
	  
	    
	    window.removeMsgByKey = function(key,callback) {
	        cordova.exec(callback, function(err) {
	            callback('Nothing to echo.');
	        }, "PreferencesStorage", "removeMsg", [key]);
	    };

	    window.removeAll = function(callback) {
	        cordova.exec(callback, function(err) {
	            callback('Nothing to echo.');
	        }, "PreferencesStorage", "removeAll", [key]);
	    };
	  

