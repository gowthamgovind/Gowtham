
package project.emp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Train {

	public int getTid() {
		return tid;
	}


	public void setTid(int tid) {
		this.tid = tid;
	}


	public String getTname() {
		return tname;
	}


	public void setTname(String tname) {
		this.tname = tname;
	}


	public String getTtype() {
		return ttype;
	}


	public void setTtype(String ttype) {
		this.ttype = ttype;
	}


	public int getTcost() {
		return tcost;
	}


	public void setTcost(int tcost) {
		this.tcost = tcost;
	}


	@Id
	private int tid;
	private String tname;
	private String ttype;
	private int tcost ;


	public Train(int tid, String tname, String ttype, int tcost) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.ttype = ttype;
		this.tcost = tcost;
	}

}