/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Exception.ConnectionNotFoundException;
import Exception.ObjectNotFoundInDatabaseException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fasalles
 */
public class Student extends User{
    
    private String netudiant;
    private Map<Integer, Double> notes = new HashMap<Integer, Double>();
    
    public Student()
    {
        super();
    }
    
    public Student(String netudiant) throws ObjectNotFoundInDatabaseException, ConnectionNotFoundException, SQLException
    {
        this(StudentTable.findById(netudiant));
    }
    
    public Student(String login, String password) throws ConnectionNotFoundException, SQLException, ObjectNotFoundInDatabaseException
    {
        this(StudentTable.findByLoginAndPassword(login, password));
    }

    public Student(Student student)
    {
        this.init(student);
    }
    
    public Student(ResultSet rs) throws SQLException
    {
        this.init(rs);
    }
    
    public String getNetudiant()
    {
        return netudiant;
    }

    public void setNetudiant(String nuetudiant)
    {
        this.netudiant = nuetudiant;
    }
    
    public Double getNote(Integer idModule)
    {
        return this.notes.get(idModule);
    }
    
    public void setNote(Integer idModule, Double note)
    {
        this.notes.put(idModule, note);
    }
    /**
     * Initialize Object    
     * @param rs 
     */
    public void init(ResultSet rs) throws SQLException
    {
        super.init(rs);
        this.netudiant = rs.getString("netudiant");
    }
    
    public void init(Student student)
    {
        super.init((User)student);
        this.netudiant = student.getNetudiant();
    }
}
