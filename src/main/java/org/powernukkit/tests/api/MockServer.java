/*
 * PowerNukkit JUnit 5 Testing Framework
 * Copyright (C) 2020  José Roberto de Araújo Júnior
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.powernukkit.tests.api;

import cn.nukkit.plugin.Plugin;
import org.apiguardian.api.API;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static org.apiguardian.api.API.Status.EXPERIMENTAL;

/**
 * @author joserobjr
 */
@Target(TYPE)
@Retention(RUNTIME)
@Documented
@API(status = EXPERIMENTAL, since = "0.1.0")
public @interface MockServer {
    @API(status = EXPERIMENTAL, since = "0.1.0")
    String name() default "TestServer";

    @API(status = EXPERIMENTAL, since = "0.1.0")
    int maxPlayers() default 20;

    @API(status = EXPERIMENTAL, since = "0.1.0")
    MockLevel[] levels() default {};

    @API(status = EXPERIMENTAL, since = "0.1.0")
    MockPlayer[] players() default {};

    @API(status = EXPERIMENTAL, since = "0.1.0")
    Class<? extends Plugin>[] plugins() default {};

    @API(status = EXPERIMENTAL, since = "0.1.0")
    boolean initPrivateFields() default true;

    @API(status = EXPERIMENTAL, since = "0.1.0")
    boolean callsRealMethods() default true;

    @API(status = EXPERIMENTAL, since = "0.1.0")
    boolean createTempDir() default true;
}
