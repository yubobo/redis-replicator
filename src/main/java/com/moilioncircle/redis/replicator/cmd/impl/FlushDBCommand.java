/*
 * Copyright 2016 leon chen
 *
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
 */

package com.moilioncircle.redis.replicator.cmd.impl;

import com.moilioncircle.redis.replicator.cmd.Command;

/**
 * @author Leon Chen
 * @since 2.1.0
 */
public class FlushDBCommand implements Command {

    private static final long serialVersionUID = 1L;

    private Boolean isAsync;

    public FlushDBCommand() {
    }

    public FlushDBCommand(final Boolean isAsync) {
        this.isAsync = isAsync;
    }

    public Boolean isAsync() {
        return isAsync;
    }

    public Boolean getAsync() {
        return isAsync;
    }

    public void setAsync(Boolean async) {
        isAsync = async;
    }

    @Override
    public String toString() {
        return "FlushDBCommand{" +
                "isAsync=" + isAsync +
                '}';
    }
}
