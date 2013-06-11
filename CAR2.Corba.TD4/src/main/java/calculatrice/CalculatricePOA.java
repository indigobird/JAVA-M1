package calculatrice;


/**
* calculatrice/CalculatricePOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from calculatrice.idl
* vendredi 7 juin 2013 15 h 07 CEST
*/

public abstract class CalculatricePOA extends org.omg.PortableServer.Servant
 implements calculatrice.CalculatriceOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("addition", new java.lang.Integer (0));
    _methods.put ("sub", new java.lang.Integer (1));
    _methods.put ("mult", new java.lang.Integer (2));
    _methods.put ("div", new java.lang.Integer (3));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // calculatrice/Calculatrice/addition
       {
         try {
           org.omg.CORBA.Any nb1 = in.read_any ();
           org.omg.CORBA.Any nb2 = in.read_any ();
           org.omg.CORBA.Any $result = null;
           $result = this.addition (nb1, nb2);
           out = $rh.createReply();
           out.write_any ($result);
         } catch (calculatrice.badParam $ex) {
           out = $rh.createExceptionReply ();
           calculatrice.badParamHelper.write (out, $ex);
         }
         break;
       }

       case 1:  // calculatrice/Calculatrice/sub
       {
         try {
           org.omg.CORBA.Any nb1 = in.read_any ();
           org.omg.CORBA.Any nb2 = in.read_any ();
           org.omg.CORBA.Any $result = null;
           $result = this.sub (nb1, nb2);
           out = $rh.createReply();
           out.write_any ($result);
         } catch (calculatrice.badParam $ex) {
           out = $rh.createExceptionReply ();
           calculatrice.badParamHelper.write (out, $ex);
         }
         break;
       }

       case 2:  // calculatrice/Calculatrice/mult
       {
         try {
           org.omg.CORBA.Any nb1 = in.read_any ();
           org.omg.CORBA.Any nb2 = in.read_any ();
           org.omg.CORBA.Any $result = null;
           $result = this.mult (nb1, nb2);
           out = $rh.createReply();
           out.write_any ($result);
         } catch (calculatrice.badParam $ex) {
           out = $rh.createExceptionReply ();
           calculatrice.badParamHelper.write (out, $ex);
         }
         break;
       }

       case 3:  // calculatrice/Calculatrice/div
       {
         try {
           org.omg.CORBA.Any nb1 = in.read_any ();
           org.omg.CORBA.Any nb2 = in.read_any ();
           org.omg.CORBA.Any $result = null;
           $result = this.div (nb1, nb2);
           out = $rh.createReply();
           out.write_any ($result);
         } catch (calculatrice.badParam $ex) {
           out = $rh.createExceptionReply ();
           calculatrice.badParamHelper.write (out, $ex);
         } catch (calculatrice.divZero $ex) {
           out = $rh.createExceptionReply ();
           calculatrice.divZeroHelper.write (out, $ex);
         }
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:calculatrice/Calculatrice:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Calculatrice _this() 
  {
    return CalculatriceHelper.narrow(
    super._this_object());
  }

  public Calculatrice _this(org.omg.CORBA.ORB orb) 
  {
    return CalculatriceHelper.narrow(
    super._this_object(orb));
  }


} // class CalculatricePOA
