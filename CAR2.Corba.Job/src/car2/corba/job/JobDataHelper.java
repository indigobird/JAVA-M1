package car2.corba.job;


/**
* car2/corba/job/JobDataHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Job.idl
* vendredi 31 mai 2013 14 h 46 CEST
*/

abstract public class JobDataHelper
{
  private static String  _id = "IDL:car2/corba/job/JobData:1.0";

  public static void insert (org.omg.CORBA.Any a, car2.corba.job.Job that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static car2.corba.job.Job extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = car2.corba.job.JobHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (car2.corba.job.JobDataHelper.id (), "JobData", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static car2.corba.job.Job read (org.omg.CORBA.portable.InputStream istream)
  {
    car2.corba.job.Job value = null;
    value = car2.corba.job.JobHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, car2.corba.job.Job value)
  {
    car2.corba.job.JobHelper.write (ostream, value);
  }

}
