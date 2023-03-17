create table People_Loans (
	uuid_ VARCHAR(75) null,
	peopleId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	surname VARCHAR(75) null,
	birth DATE null,
	total_loan DOUBLE
);