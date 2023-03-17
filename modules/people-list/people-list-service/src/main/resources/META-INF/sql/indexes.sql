create index IX_EFECD292 on People_Loans (surname[$COLUMN_LENGTH:75$]);
create index IX_38F0A48D on People_Loans (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_4782EA4F on People_Loans (uuid_[$COLUMN_LENGTH:75$], groupId);