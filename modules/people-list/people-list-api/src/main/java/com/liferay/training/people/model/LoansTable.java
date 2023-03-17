/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.training.people.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;People_Loans&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Loans
 * @generated
 */
public class LoansTable extends BaseTable<LoansTable> {

	public static final LoansTable INSTANCE = new LoansTable();

	public final Column<LoansTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<LoansTable, Long> peopleId = createColumn(
		"peopleId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<LoansTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<LoansTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<LoansTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<LoansTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<LoansTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<LoansTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<LoansTable, String> name = createColumn(
		"name", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<LoansTable, String> surname = createColumn(
		"surname", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<LoansTable, Date> birth = createColumn(
		"birth", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<LoansTable, Float> total_loan = createColumn(
		"total_loan", Float.class, Types.FLOAT, Column.FLAG_DEFAULT);

	private LoansTable() {
		super("People_Loans", LoansTable::new);
	}

}