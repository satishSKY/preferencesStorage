# preferencesStorage
preferencesStorage support android storage in key value pair. It is very simple to use.

>>for Get all stored data on preferencesStorage :

window.getAll(function(echoValue) {
   console.log(echoValue);
});
	    
>>for store msg on preferencesStorage :

window.storeMsg( ["userName","sky"],function(echoValue) {
      console.log(echoValue); // should alert true.
});

>>for get msg by key:

window.getMsgByKey( "userName",function(echoValue) {
  console.log(echoValue); // should alert true.
});


>> For remove msg By Key : 

window.removeMsgByKey("userName", function(echoValue) {
   console.log(echoValue); // should alert true.
});


>>clear preferencesStorage : 

window.removeAll( function(echoValue) {
  console.log(echoValue); // should alert true.
});
