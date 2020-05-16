# Error Treatment


Returning -1 is a bad ideia, once the user do not know why he is receveing a -1 as output, or if -1 is a valid output.


* **Throws**: To create an exception, the class must "extend Exception{}". If the method could give as output an error, this method should "throws the exception", when throwing an error, you should instantiate a new exeption object (using 'new'). 
Example: public void method(int param) throws MyException{ if(error){ throw new MyException("error"); } }

* **Try / Catch**: The code is going to run the code inside the try{}, and if an error ocurredm it can be treated inside Catch{}.
Example: public void method(int param){ try{object.method();}catch(MyException e){ error treatment } }



# Observation

RuntimeException errors indicate normal errors, that obligatory do not need to be treated.
