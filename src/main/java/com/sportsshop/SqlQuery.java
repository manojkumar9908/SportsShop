package com.sportsshop;

import com.sportsshop.dao.Connectionjdbc;

public class SqlQuery {
	public static void Datain(Registration t) throws Exception {
		String query= " insert into Sports_shop (name, email,password,number) values ('"+t.name+"','"+t.email+"','"+t.password+"','"+t.number+"')";
		Connectionjdbc.con(query);

}
}
