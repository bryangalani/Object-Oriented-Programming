# Error Treatment


Returning -1 is a bad idea, once the user does not know why he is receiving a -1 as output, or if -1 is a valid output.


* **Throws**: To create an exception, the class must "extend Exception{}". If the method could give as output an error, this method should "throws the exception", when throwing an error, you should instantiate a new exception object (using 'new'). 
Example: public void method(int param) throws MyException{ if(error){ throw new MyException("error"); } }

* **Try / Catch and finally**: The program is going to run the code inside the try{}, and if an error occurred it can be treated inside Catch{}. When the exception occurs in the try() method, it jumps the following lines directly to the catch() method, without executing what was after the exception.
Example: public void method(int param){ try{object.method();}catch(MyException e){ error treatment } }

Several catch() methods could exist after try(), but just one will be executed (tried respectively, until one exception match). Each catch() method should treat different exceptions (Exception, IOException, SQLException, etc..). The IOException is a subclass of Exception, so it should be run first. All Exception subclasses should be run first then the superclass Exception.

The "finally" will be executed independently if an exception occurs or not. Normally used to close open files.

Example: try{b.method();}catch (IOException | SQLException e){Io and SQL error treatment}catch(Exception e){if not IO or SQL error, error treatment}finally{b.close();}

The  **fail()** in the try/catch, is used to confirm if the exception occurred before the line fail(). So if the exception occurred as expected, the fail() should not be run.
Example: try{b.method(); fail();}catch(BoomException e){treat error}

# Stack Trace
Every error lets a trace behind (in the console), showing the path that it ran through. It is necessary to read the stack trace, to find the error message, the class that ran an exception, and all the path that it ran through.


# Observation

RuntimeException errors indicate normal errors, that does not need to be treated obligatorily.
