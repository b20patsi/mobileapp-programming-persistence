package com.example.persistence;

class DatabaseTable {
    static class People {

        static final String TABLE_NAME = "mountain";
        static final String COLUMN_NAME_NAME = "name";
        static final String COLUMN_NAME_AGE = "age";
        static final String COLUMN_NAME_CITY = "city";

    }

    static final String SQL_CREATE_TABLE_PEOPLE =
            // "CREATE TABLE mountain (id INTEGER PRIMARY KEY, name TEXT, height INT)"
            "CREATE TABLE " + People.TABLE_NAME + " (" +
                    People.COLUMN_NAME_NAME + " STRING PRIMARY KEY," +
                    People.COLUMN_NAME_AGE + " INT," +
                    People.COLUMN_NAME_CITY + " STRING)";

    static final String SQL_DELETE_TABLE_PEOPLE =
            // "DROP TABLE IF EXISTS mountain"
            "DROP TABLE IF EXISTS " + People.TABLE_NAME;
}
