package car2.corba.td2.coureur.THPackage;


/**
* car2/corba/td2/coureur/THPackage/coureurHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from TH.idl
* vendredi 17 mai 2013 15 h 20 CEST
*/

abstract public class coureurHelper
{
  private static String  _id = "IDL:car2/corba/td2/coureur/TH/coureur:1.0";

  public static void insert (org.omg.CORBA.Any a, car2.corba.td2.coureur.THPackage.Personne that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static car2.corba.td2.coureur.THPackage.Personne extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = car2.corba.td2.coureur.THPackage.PersonneHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (car2.corba.td2.coureur.THPackage.coureurHelper.id (), "coureur", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static car2.corba.td2.coureur.THPackage.Personne read (org.omg.CORBA.portable.InputStream istream)
  {
    car2.corba.td2.coureur.THPackage.Personne value = null;
    value = car2.corba.td2.coureur.THPackage.PersonneHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, car2.corba.td2.coureur.THPackage.Personne value)
  {
    car2.corba.td2.coureur.THPackage.PersonneHelper.write (ostream, value);
  }

}