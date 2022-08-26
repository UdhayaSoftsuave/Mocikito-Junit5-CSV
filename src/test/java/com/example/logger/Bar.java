package com.example.logger;



public class Bar {
	
	 private  Foo foo;

	    public Bar(final Foo foo) {
	        this.foo = foo;
	    }

	    public void doSmth() {
	        this.foo.bla("val");
	    }

}
