/**
 *
 * Copyright 2013 Florian Schmaus.
 *
 * All rights reserved. Licensed under the Apache License, Version 2.0 (the "License");
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

package org.jivesoftware.smack.parsing;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 * Simple parsing exception callback that only logs the encountered parsing
 * exception to java util logging.
 * 
 * @author Florian Schmaus
 * 
 */
public class ExceptionLoggingCallback extends ParsingExceptionCallback {
    private static Logger log = Logger.getLogger(ExceptionLoggingCallback.class
            .getName());

    @Override
    public void handleUnparsablePacket(UnparsablePacket unparsed)
            throws Exception {
        log.log(Level.ERROR, "Smack message parsing exception: ",
                unparsed.getParsingException());
        log.error("Unparsed content: " + unparsed.getContent());
    }
}
