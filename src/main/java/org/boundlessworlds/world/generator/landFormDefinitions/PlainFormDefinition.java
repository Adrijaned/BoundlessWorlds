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
package org.boundlessworlds.world.generator.landFormDefinitions;


import org.boundlessworlds.utilities.procedural.adapter.AdditionAdapter;
import org.boundlessworlds.utilities.procedural.adapter.MultiplicationAdapter;
import org.boundlessworlds.world.generation.facets.InfiniteGenFacet;
import org.terasology.math.geom.Vector3f;
import org.terasology.utilities.procedural.BrownianNoise3D;
import org.terasology.utilities.procedural.Noise3D;
import org.terasology.utilities.procedural.SimplexNoise;
import org.terasology.utilities.procedural.SubSampledNoise3D;
import org.terasology.world.generation.Produces;

@Produces(InfiniteGenFacet.class)
public class PlainFormDefinition extends LandFormDefinition implements Noise3D {
    
    /**
     * 
     * @param formValue
     */
	public PlainFormDefinition(long seed){
    	super(10);
    	this.maxDensity=3f;
    	this.minDensity=Float.MIN_VALUE;
    	this.maxAltitude=1000f;
    	this.minAltitude=-500f;
    	this.maxTemperature=Float.MAX_VALUE;
    	this.minTemperature=Float.MIN_VALUE;	
    	this.maxHumidity=Float.MAX_VALUE;
    	this.minHumidity=Float.MIN_VALUE;
    	
    	this.noiseList.add(new SubSampledNoise3D(
    			new MultiplicationAdapter(new AdditionAdapter(new BrownianNoise3D(new SimplexNoise(seed),2),0.1f),0.8f),
    					new Vector3f(0.0005f, 0.0005f, 0.0005f),4
    			)
    	);
    }
    
}