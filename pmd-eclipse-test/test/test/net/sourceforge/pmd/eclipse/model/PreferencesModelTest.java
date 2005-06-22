/*
 * Created on 6 f�vr. 2005
 *
 * Copyright (c) 2004, PMD for Eclipse Development Team
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 * 
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * The end-user documentation included with the redistribution, if
 *       any, must include the following acknowledgement:
 *       "This product includes software developed in part by support from
 *        the Defense Advanced Research Project Agency (DARPA)"
 *     * Neither the name of "PMD for Eclipse Development Team" nor the names of its
 *       contributors may be used to endorse or promote products derived from
 *       this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
 * TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER
 * OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package test.net.sourceforge.pmd.eclipse.model;

import net.sourceforge.pmd.eclipse.model.ModelFactory;
import net.sourceforge.pmd.eclipse.model.PreferencesModel;
import junit.framework.TestCase;

/**
 * 
 * 
 * @author Philippe Herlin
 * @version $Revision$
 * 
 * $Log$
 * Revision 1.1  2005/06/15 21:14:56  phherlin
 * Create the project for the Eclipse plugin unit tests
 *
 *
 */
public class PreferencesModelTest extends TestCase {
    private static final String REVIEW_ADDITIONAL_COMMENT = "sample review additional comment";
    
    /**
     * Test case constructor
     * @param name of the test case
     */
    public PreferencesModelTest(String name) {
        super(name);
    }
    
    /**
     * Plugin preferences should contains a review additional comment.
     * This preference must be access through a model.
     *
     */
    public void testReviewAdditionalComment() {
        // Get the preference model
        PreferencesModel model = ModelFactory.getFactory().getPreferencesModel();
        assertNotNull("Cannot get a preferenes model", model);
        
        // Store a comment
        model.setReviewAdditionalComment(REVIEW_ADDITIONAL_COMMENT);
        // nothing to assert yet
        
        // try get the comment
        String comment = model.getReviewAdditionalComment();
        assertNotNull(comment);
        assertEquals(REVIEW_ADDITIONAL_COMMENT, comment);
    }
    
}