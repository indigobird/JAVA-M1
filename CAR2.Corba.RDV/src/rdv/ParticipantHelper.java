package rdv;


/**
* rdv/ParticipantHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from rdv.idl
* mardi 11 juin 2013 13 h 21 CEST
*/

abstract public class ParticipantHelper
{
  private static String  _id = "IDL:rdv/Participant:1.0";

  public static void insert (org.omg.CORBA.Any a, rdv.Participant that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static rdv.Participant extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (rdv.ParticipantHelper.id (), "Participant");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static rdv.Participant read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_ParticipantStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, rdv.Participant value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static rdv.Participant narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof rdv.Participant)
      return (rdv.Participant)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      rdv._ParticipantStub stub = new rdv._ParticipantStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static rdv.Participant unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof rdv.Participant)
      return (rdv.Participant)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      rdv._ParticipantStub stub = new rdv._ParticipantStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}