/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Other licenses:
 * -----------------------------------------------------------------------------
 * Commercial licenses for this work are available. These replace the above
 * ASL 2.0 and offer limited warranties, support, maintenance, and commercial
 * database integrations.
 *
 * For more information, please visit: http://www.jooq.org/licenses
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package org.jooq.util.filemaker;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.OffsetDateTime;
import java.util.UUID;

import org.jooq.DataType;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DefaultDataType;
import org.jooq.impl.SQLDataType;
import org.jooq.types.UByte;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;
import org.jooq.types.UShort;

/**
 * Supported data types for the {@link SQLDialect#FILEMAKER} dialect
 *
 * @author John Keates
 * @see <a href="https://fmhelp.filemaker.com/docs/16/en/fm16_sql_reference.pdf">https://fmhelp.filemaker.com/docs/16/en/fm16_sql_reference.pdf</a>
 */
public class FilemakerDataType {

    // -------------------------------------------------------------------------
    // Default SQL data types and synonyms thereof
    // -------------------------------------------------------------------------


    // SUPPORTED TYPES
    /*
           registerColumnType(Types.VARCHAR, "string");
        registerColumnType(Types.DOUBLE, "double"); or decimal
        registerColumnType(Types.DATE, "date");
        registerColumnType(Types.TIME, "time");
        registerColumnType(Types.TIMESTAMP, "timestamp");
        registerColumnType(Types.BLOB, "blob");

     */

    public static final DataType<String>      VARCHAR              = new DefaultDataType<String>(SQLDialect.FILEMAKER, SQLDataType.VARCHAR, "varchar");
    public static final DataType<String>      CHARACTER_VARYING    = new DefaultDataType<String>(SQLDialect.FILEMAKER, SQLDataType.VARCHAR, "varchar");
    public static final DataType<Double>      DECIMAL              = new DefaultDataType<Double>(SQLDialect.FILEMAKER, SQLDataType.DOUBLE, "smallint");
    public static final DataType<Double>      INT                  = new DefaultDataType<Double>(SQLDialect.FILEMAKER, SQLDataType.DOUBLE, "int");
    public static final DataType<byte[]>      BLOB                 = new DefaultDataType<byte[]>(SQLDialect.FILEMAKER, SQLDataType.BLOB, "blob");
    public static final DataType<byte[]>      VARBINARY            = new DefaultDataType<byte[]>(SQLDialect.FILEMAKER, SQLDataType.VARBINARY, "varbinary");
    public static final DataType<byte[]>      LONGVARBINARY        = new DefaultDataType<byte[]>(SQLDialect.FILEMAKER, SQLDataType.LONGVARBINARY, "longvarbinary");
    public static final DataType<byte[]>      BINARY_VARYING       = new DefaultDataType<byte[]>(SQLDialect.FILEMAKER, SQLDataType.VARBINARY, "varbinary");
    public static final DataType<Time>        TIME                 = new DefaultDataType<Time>(SQLDialect.FILEMAKER, SQLDataType.TIME, "time");
    public static final DataType<Date>        DATE                 = new DefaultDataType<Date>(SQLDialect.FILEMAKER, SQLDataType.DATE, "date");
    public static final DataType<Timestamp>   TIMESTAMP            = new DefaultDataType<Timestamp>(SQLDialect.FILEMAKER, SQLDataType.TIMESTAMP, "timestamp");


//
//
//    public static final DataType<Double>      SMALLINT                  = new DefaultDataType<Double>(SQLDialect.FILEMAKER, SQLDataType.DOUBLE, "smallint");
//    public static final DataType<Double>      INT2                      = new DefaultDataType<Double>(SQLDialect.FILEMAKER, SQLDataType.DOUBLE, "int2");
//    public static final DataType<Double>    INT                       = new DefaultDataType<Double>(SQLDialect.FILEMAKER, SQLDataType.DOUBLE, "int");
//    public static final DataType<Double>    INTEGER                   = new DefaultDataType<Double>(SQLDialect.FILEMAKER, SQLDataType.DOUBLE, "integer");
//    public static final DataType<Double>    MEDIUMINT                 = new DefaultDataType<Double>(SQLDialect.FILEMAKER, SQLDataType.DOUBLE, "mediumint");
//    public static final DataType<Double>    INT4                      = new DefaultDataType<Double>(SQLDialect.FILEMAKER, SQLDataType.DOUBLE, "int4");
//    public static final DataType<Double>    SIGNED                    = new DefaultDataType<Double>(SQLDialect.FILEMAKER, SQLDataType.DOUBLE, "signed");
//    public static final DataType<String>    BOOLEAN                   = new DefaultDataType<String>(SQLDialect.FILEMAKER, SQLDataType.VARCHAR, "boolean");
//    public static final DataType<String>    BOOL                      = new DefaultDataType<String>(SQLDialect.FILEMAKER, SQLDataType.VARCHAR, "bool");
//    public static final DataType<String>    BIT                       = new DefaultDataType<String>(SQLDialect.FILEMAKER, SQLDataType.VARCHAR, "bit");
//    public static final DataType<Long>       BIGINT                    = new DefaultDataType<Long>(SQLDialect.FILEMAKER, SQLDataType.BIGINT, "bigint");
//    public static final DataType<BigDecimal> DECIMAL                   = new DefaultDataType<BigDecimal>(SQLDialect.FILEMAKER, SQLDataType.DECIMAL, "decimal");
//    public static final DataType<BigDecimal> DEC                       = new DefaultDataType<BigDecimal>(SQLDialect.FILEMAKER, SQLDataType.DECIMAL, "dec");
//    public static final DataType<BigDecimal> NUMBER                    = new DefaultDataType<BigDecimal>(SQLDialect.FILEMAKER, SQLDataType.NUMERIC, "number");
//    public static final DataType<BigDecimal> NUMERIC                   = new DefaultDataType<BigDecimal>(SQLDialect.FILEMAKER, SQLDataType.NUMERIC, "numeric");
//    public static final DataType<Double>     DOUBLE                    = new DefaultDataType<Double>(SQLDialect.FILEMAKER, SQLDataType.DOUBLE, "double");
//    public static final DataType<Double>     FLOAT                     = new DefaultDataType<Double>(SQLDialect.FILEMAKER, SQLDataType.FLOAT, "float");
//    public static final DataType<Double>     FLOAT4                    = new DefaultDataType<Double>(SQLDialect.FILEMAKER, SQLDataType.FLOAT, "float4");
//    public static final DataType<Double>     FLOAT8                    = new DefaultDataType<Double>(SQLDialect.FILEMAKER, SQLDataType.FLOAT, "float8");
//    public static final DataType<Float>      REAL                      = new DefaultDataType<Float>(SQLDialect.FILEMAKER, SQLDataType.REAL, "real");
//    public static final DataType<Time>       TIME                      = new DefaultDataType<Time>(SQLDialect.FILEMAKER, SQLDataType.TIME, "time");
//    public static final DataType<Date>       DATE                      = new DefaultDataType<Date>(SQLDialect.FILEMAKER, SQLDataType.DATE, "date");
//    public static final DataType<Timestamp>  TIMESTAMP                 = new DefaultDataType<Timestamp>(SQLDialect.FILEMAKER, SQLDataType.TIMESTAMP, "timestamp");
//    public static final DataType<Timestamp>  DATETIME                  = new DefaultDataType<Timestamp>(SQLDialect.FILEMAKER, SQLDataType.TIMESTAMP, "datetime");
//
//
//    public static final DataType<byte[]>     BINARY                    = new DefaultDataType<byte[]>(SQLDialect.FILEMAKER, SQLDataType.BINARY, "binary");
//    public static final DataType<byte[]>     VARBINARY                 = new DefaultDataType<byte[]>(SQLDialect.FILEMAKER, SQLDataType.VARBINARY, "varbinary");
//    public static final DataType<byte[]>     LONGVARBINARY             = new DefaultDataType<byte[]>(SQLDialect.FILEMAKER, SQLDataType.LONGVARBINARY, "longvarbinary");
//    public static final DataType<byte[]>     BLOB                      = new DefaultDataType<byte[]>(SQLDialect.FILEMAKER, SQLDataType.BLOB, "blob");
//    public static final DataType<Object>     OTHER                     = new DefaultDataType<Object>(SQLDialect.FILEMAKER, SQLDataType.OTHER, "other");
//    public static final DataType<String>     VARCHAR                   = new DefaultDataType<String>(SQLDialect.FILEMAKER, SQLDataType.VARCHAR, "varchar");
//    public static final DataType<String>     VARCHAR2                  = new DefaultDataType<String>(SQLDialect.FILEMAKER, SQLDataType.VARCHAR, "varchar2");
//    public static final DataType<String>     CHAR                      = new DefaultDataType<String>(SQLDialect.FILEMAKER, SQLDataType.CHAR, "char");
//    public static final DataType<String>     CHARACTER                 = new DefaultDataType<String>(SQLDialect.FILEMAKER, SQLDataType.CHAR, "character");
//    public static final DataType<String>     LONGVARCHAR               = new DefaultDataType<String>(SQLDialect.FILEMAKER, SQLDataType.LONGVARCHAR, "longvarchar");
//    public static final DataType<String>     CLOB                      = new DefaultDataType<String>(SQLDialect.FILEMAKER, SQLDataType.CLOB, "clob");
//    public static final DataType<String>     NVARCHAR                  = new DefaultDataType<String>(SQLDialect.FILEMAKER, SQLDataType.NVARCHAR, "nvarchar");
//    public static final DataType<String>     NVARCHAR2                 = new DefaultDataType<String>(SQLDialect.FILEMAKER, SQLDataType.NVARCHAR, "nvarchar2");
//    public static final DataType<String>     NCHAR                     = new DefaultDataType<String>(SQLDialect.FILEMAKER, SQLDataType.NCHAR, "nchar");
//    public static final DataType<String>     NCLOB                     = new DefaultDataType<String>(SQLDialect.FILEMAKER, SQLDataType.NCLOB, "nclob");

    // -------------------------------------------------------------------------
    // Compatibility types for supported SQLDialect.FILEMAKER, SQLDataTypes
    // -------------------------------------------------------------------------

    // Filemaker has none

    // -------------------------------------------------------------------------
    // Compatibility types for supported Java types
    // -------------------------------------------------------------------------

    // Filemaker has none


    // -------------------------------------------------------------------------
    // Dialect-specific data types and synonyms thereof
    // -------------------------------------------------------------------------

    // Filemaker has none

}
