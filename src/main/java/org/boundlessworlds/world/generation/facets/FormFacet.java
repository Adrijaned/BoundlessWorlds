/*
 * Copyright 2014 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.boundlessworlds.world.generation.facets;

import org.terasology.math.Region3i;
import org.terasology.world.generation.Border3D;
import org.terasology.world.generation.facets.base.BaseFieldFacet3D;

/**
 * @author Esereja
 */
public class FormFacet extends BaseFieldFacet3D {

	public float max,min; 
	
	/**
	 * 
	 * @param targetRegion
	 * @param border
	 */
    public FormFacet(Region3i targetRegion, Border3D border) {
        super(targetRegion, border);
    }

	/**
	 * @return the max
	 */
	public float getMax() {
		return max;
	}

	/**
	 * @param max the max to set
	 */
	public void setMax(float max) {
		this.max = max;
	}

	/**
	 * @return the min
	 */
	public float getMin() {
		return min;
	}

	/**
	 * @param min the min to set
	 */
	public void setMin(float min) {
		this.min = min;
	}
    
    
    
}
