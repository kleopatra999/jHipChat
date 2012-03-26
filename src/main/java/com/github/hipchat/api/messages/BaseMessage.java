/*   
 * Copyright [2012] [Nicholas Campion]
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
 * 
 * Authored by Nick Campion campnic@gmail.com
 */

package com.github.hipchat.api.messages;

import com.github.hipchat.api.Room;
import com.github.hipchat.api.UserId;

public class BaseMessage implements Message
{

    protected Room room;
    protected UserId from;
    protected String message;

    protected BaseMessage(Room room, UserId from, String message)
    {
        this.room = room;
        this.from = from;
        this.message = message;
    }

    public UserId getSender()
    {
        return from;
    }

    public String getText()
    {
        return message;
    }

    public Room getRoom()
    {
        return room;
    }
}