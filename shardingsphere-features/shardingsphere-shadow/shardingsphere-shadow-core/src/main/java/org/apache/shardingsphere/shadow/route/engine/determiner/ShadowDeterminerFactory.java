/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.shadow.route.engine.determiner;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.apache.shardingsphere.shadow.api.shadow.column.ColumnShadowAlgorithm;
import org.apache.shardingsphere.shadow.api.shadow.hint.HintShadowAlgorithm;
import org.apache.shardingsphere.shadow.route.engine.determiner.algorithm.ColumnShadowAlgorithmDeterminer;
import org.apache.shardingsphere.shadow.route.engine.determiner.algorithm.HintShadowAlgorithmDeterminer;

/**
 * Shadow determiner factory.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ShadowDeterminerFactory {
    
    /**
     * Create new instance of Shadow algorithm determiner.
     *
     * @param hintShadowAlgorithm hint shadow algorithm
     * @return new instance of Shadow algorithm determiner
     */
    public static ShadowAlgorithmDeterminer newInstance(final HintShadowAlgorithm<Comparable<?>> hintShadowAlgorithm) {
        return new HintShadowAlgorithmDeterminer(hintShadowAlgorithm);
    }
    
    /**
     * Create new instance of Shadow algorithm determiner.
     *
     * @param columnShadowAlgorithm column shadow algorithm
     * @return new instance of Shadow algorithm determiner
     */
    public static ShadowAlgorithmDeterminer newInstance(final ColumnShadowAlgorithm<Comparable<?>> columnShadowAlgorithm) {
        return new ColumnShadowAlgorithmDeterminer(columnShadowAlgorithm);
    }
}
