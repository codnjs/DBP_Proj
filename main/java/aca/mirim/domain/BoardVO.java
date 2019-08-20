package aca.mirim.domain;

import java.util.Date;

public class BoardVO {
	public int bno;
	public String username;
	public String who;
	public Date when_;
	public Date until_;
	public String how;
	public String why;
	public String memo;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getUntil_() {
		return until_;
	}
	public void setUntil_(Date until_) {
		this.until_ = until_;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getWho() {
		return who;
	}
	public void setWho(String who) {
		this.who = who;
	}
	public Date getWhen_() {
		return when_;
	}
	public void setWhen_(Date when_) {
		this.when_ = when_;
	}
	public String getHow() {
		return how;
	}
	public void setHow(String how) {
		this.how = how;
	}
	public String getWhy() {
		return why;
	}
	public void setWhy(String why) {
		this.why = why;
	}
	
	@Override
	public String toString() {
		return "BoardVO [bno=" + bno + ", username=" + username + ", who=" + who + ", when_=" + when_ + ", until_="
				+ until_ + ", how=" + how + ", why=" + why + ", memo=" + memo + "]";
	}
	
}
