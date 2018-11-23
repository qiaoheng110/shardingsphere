/*
 * Copyright 2016-2018 shardingsphere.io.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package io.shardingsphere.core.parsing.antlr.extractor.statement.type.dialect.sqlserver;

import io.shardingsphere.core.parsing.antlr.extractor.statement.handler.AddColumnExtractor;
import io.shardingsphere.core.parsing.antlr.extractor.statement.handler.ModifyColumnExtractor;
import io.shardingsphere.core.parsing.antlr.extractor.statement.handler.dialect.sqlserver.SQLServerAddIndexExtractHandler;
import io.shardingsphere.core.parsing.antlr.extractor.statement.handler.dialect.sqlserver.SQLServerAddPrimaryKeyExtractHandler;
import io.shardingsphere.core.parsing.antlr.extractor.statement.handler.dialect.sqlserver.SQLServerDropIndexExtractHandler;
import io.shardingsphere.core.parsing.antlr.extractor.statement.type.AlterTableExtractor;

/**
 * SQLServer alter table statement extractor.
 * 
 * @author duhongjun
 */
public final class SQLServerAlterTableExtractor extends AlterTableExtractor {
    
    public SQLServerAlterTableExtractor() {
        addExtractHandler(new AddColumnExtractor());
        addExtractHandler(new ModifyColumnExtractor()); 
        addExtractHandler(new SQLServerAddIndexExtractHandler()); 
        addExtractHandler(new SQLServerDropIndexExtractHandler());
        addExtractHandler(new SQLServerAddPrimaryKeyExtractHandler());
    }
}
