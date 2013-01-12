package models;

//import java.util.*;

//import javax.persistence.*;

//import play.db.ebean.*;
//import play.data.validation.*;

public class Entry {
	public String head = "Im here";
	
	public String head2 = "...and where are u?";
}

/*
@Entity
public class Entry extends Model {
	@Id
	public Long id;
	@Constraints.Required
	public String name;
	
	public static Model.Finder<Long, Entry> find = new Model.Finder<Long, Entry>(Long.class, Entry.class);
}
*/