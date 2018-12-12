package com.testincrement.testincrement.controllers;

import com.testincrement.testincrement.service.Incrementor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class IncrementControllerTest {

    @InjectMocks
    private IncrementController incrementController;

    @Mock
    private Incrementor incrementorMock;

    @Test
    public void WhenGetDataFromInputGetWorking() {
        final int expNumber = 5;
        when(incrementorMock.getNumber()).thenReturn(expNumber);

        assertThat(incrementController.getDataFromInput(), is(expNumber));

        verify(incrementorMock).incrementNumber();
        verify(incrementorMock).getNumber();

    }
}

