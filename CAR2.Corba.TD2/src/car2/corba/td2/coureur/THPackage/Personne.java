package car2.corba.td2.coureur.THPackage;


/**
* car2/corba/td2/coureur/THPackage/Personne.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from TH.idl
* vendredi 17 mai 2013 15 h 20 CEST
*/

public final class Personne implements org.omg.CORBA.portable.IDLEntity
{
  public String nom = null;
  public String prenom = null;

  public Personne ()
  {
  } // ctor

  public Personne (String _nom, String _prenom)
  {
    nom = _nom;
    prenom = _prenom;
  } // ctor

} // class Personne
