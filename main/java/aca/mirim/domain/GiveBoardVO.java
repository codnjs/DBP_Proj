package aca.mirim.domain;

import java.util.Date;

public class GiveBoardVO {
	public int bno;
	public String userid;
	public String who;
	public Date when_;
	public Date until_;
	public String how;
	public String why;
	public String memo;
	public Date today;
	public int interest;
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
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
	
	public Date getToday() {
		return today;
	}
	public void setToday(Date today) {
		this.today = today;
	}
	public int getInterest() {
		return interest;
	}
	public void setInterest(int interest) {
		this.interest = interest;
	}
	
	@Override
	public String toString() {
		return "GiveBoardVO [bno=" + bno + ", userid=" + userid + ", who=" + who + ", when_=" + when_ + ", until_="
				+ until_ + ", how=" + how + ", why=" + why + ", memo=" + memo + ", today=" + today + ", interest="
				+ interest + "]";
	}
	
}
