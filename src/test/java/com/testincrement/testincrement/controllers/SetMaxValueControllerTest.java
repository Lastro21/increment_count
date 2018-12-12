package com.testincrement.testincrement.controllers;

import com.testincrement.testincrement.regexp.ShareRegexp;
import com.testincrement.testincrement.service.Incrementor;
import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;


import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class SetMaxValueControllerTest {

    @InjectMocks
    private SetMaxValueController setMaxValueController;
    @Mock
    private Incrementor incrementorMock;
    @Mock
    private ShareRegexp shareRegexpMock;

    @Test
    public void WhenGetDataFromInputForErrorData() {
        String strForTest = "any str";
        when(shareRegexpMock.regexpInputMaxValueCount(strForTest)).thenReturn(false);

        String result = setMaxValueController.getDataFromInput(strForTest);

        assertThat(result, CoreMatchers.is("error"));
        verify(shareRegexpMock).regexpInputMaxValueCount(strForTest);
        verify(incrementorMock, never()).setMaximumValue(anyInt());
    }

    @Test
    public void WhenGetDataFromInputForeValidData() {
        String strForTest = "11";
        when(shareRegexpMock.regexpInputMaxValueCount(strForTest)).thenReturn(true);

        String result = setMaxValueController.getDataFromInput(strForTest);

        assertThat(result, CoreMatchers.is("success"));
        verify(shareRegexpMock).regexpInputMaxValueCount(strForTest);
        verify(incrementorMock).setMaximumValue(anyInt());
    }
}