This is an example of how to register a @WebListener class globally for all web applications.

To install it, you need to:
1) create a new module and place the globalweblistener-lib.jar file in it.
2) Add that module to the <global-modules> list in the EE subsystem

In this example, the listener looks up a singleton EJB to do some work.
As such, you need to deploy the EAR as well.

Currently @EJB injection does not work in @WebListener classes which are
located in modules
