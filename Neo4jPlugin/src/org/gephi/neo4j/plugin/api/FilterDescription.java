/*
Copyright 2008-2010 Gephi
Authors : Martin Škurla
Website : http://www.gephi.org

This file is part of Gephi.

Gephi is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as
published by the Free Software Foundation, either version 3 of the
License, or (at your option) any later version.

Gephi is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with Gephi.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.gephi.neo4j.plugin.api;

/**
 *
 * @author Martin Škurla
 */
public class FilterDescription {

    private final String propertyKey;
    private final FilterOperator operator;
    private final String propertyValue;

    public FilterDescription(String propertyKey, FilterOperator operator, String propertyValue) {
        this.propertyKey = propertyKey;
        this.operator = operator;
        this.propertyValue = propertyValue;
    }

    public FilterOperator getOperator() {
        return operator;
    }

    public String getPropertyKey() {
        return propertyKey;
    }

    public String getPropertyValue() {
        return propertyValue;
    }
}
