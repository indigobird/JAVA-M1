package car2.corba.job.JobFact;

/**
* car2/corba/job/JobFact/JobFactoryHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Job.idl
* vendredi 31 mai 2013 14 h 46 CEST
*/

public final class JobFactoryHolder implements org.omg.CORBA.portable.Streamable
{
  public car2.corba.job.JobFact.JobFactory value = null;

  public JobFactoryHolder ()
  {
  }

  public JobFactoryHolder (car2.corba.job.JobFact.JobFactory initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = car2.corba.job.JobFact.JobFactoryHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    car2.corba.job.JobFact.JobFactoryHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return car2.corba.job.JobFact.JobFactoryHelper.type ();
  }

}
