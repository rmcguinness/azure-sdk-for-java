/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.virtualnetworks;

import com.microsoft.windowsazure.core.OperationResponse;
import com.microsoft.windowsazure.exception.ServiceException;
import com.microsoft.windowsazure.management.virtualnetworks.models.NetworkGetConfigurationResponse;
import com.microsoft.windowsazure.management.virtualnetworks.models.NetworkListResponse;
import com.microsoft.windowsazure.management.virtualnetworks.models.NetworkSetConfigurationParameters;
import com.microsoft.windowsazure.management.virtualnetworks.models.VirtualNetworkOperationStatusResponse;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

public interface NetworkOperations {
    /**
    * The Set Network Configuration operation asynchronously configures the
    * virtual network  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj157181.aspx for
    * more information)
    *
    * @param parameters The updated network configuration.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return A standard storage response including an HTTP status code and
    * request ID.
    */
    OperationResponse beginSettingConfiguration(NetworkSetConfigurationParameters parameters) throws IOException, ServiceException;
    
    /**
    * The Set Network Configuration operation asynchronously configures the
    * virtual network  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj157181.aspx for
    * more information)
    *
    * @param parameters The updated network configuration.
    * @return A standard storage response including an HTTP status code and
    * request ID.
    */
    Future<OperationResponse> beginSettingConfigurationAsync(NetworkSetConfigurationParameters parameters);
    
    /**
    * The Get Network Configuration operation retrieves the network
    * configuration file for the given subscription.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj157196.aspx for
    * more information)
    *
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return The Get Network Configuration operation response.
    */
    NetworkGetConfigurationResponse getConfiguration() throws IOException, ServiceException;
    
    /**
    * The Get Network Configuration operation retrieves the network
    * configuration file for the given subscription.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj157196.aspx for
    * more information)
    *
    * @return The Get Network Configuration operation response.
    */
    Future<NetworkGetConfigurationResponse> getConfigurationAsync();
    
    /**
    * The List Virtual network sites operation retrieves the virtual networks
    * configured for the subscription.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj157185.aspx for
    * more information)
    *
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @return The response structure for the Server List operation.
    */
    NetworkListResponse list() throws IOException, ServiceException, ParserConfigurationException, SAXException;
    
    /**
    * The List Virtual network sites operation retrieves the virtual networks
    * configured for the subscription.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj157185.aspx for
    * more information)
    *
    * @return The response structure for the Server List operation.
    */
    Future<NetworkListResponse> listAsync();
    
    /**
    * The Set Network Configuration operation asynchronously configures the
    * virtual network  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj157181.aspx for
    * more information)
    *
    * @param parameters The updated network configuration.
    * @throws InterruptedException Thrown when a thread is waiting, sleeping,
    * or otherwise occupied, and the thread is interrupted, either before or
    * during the activity. Occasionally a method may wish to test whether the
    * current thread has been interrupted, and if so, to immediately throw
    * this exception. The following code can be used to achieve this effect:
    * @throws ExecutionException Thrown when attempting to retrieve the result
    * of a task that aborted by throwing an exception. This exception can be
    * inspected using the Throwable.getCause() method.
    * @throws ServiceException Thrown if the server returned an error for the
    * request.
    * @throws IOException Thrown if there was an error setting up tracing for
    * the request.
    * @return The response body contains the status of the specified
    * asynchronous operation, indicating whether it has succeeded, is
    * inprogress, or has failed. Note that this status is distinct from the
    * HTTP status code returned for the Get Operation Status operation itself.
    * If the asynchronous operation succeeded, the response body includes the
    * HTTP status code for the successful request.  If the asynchronous
    * operation failed, the response body includes the HTTP status code for
    * the failed request, and also includes error information regarding the
    * failure.
    */
    VirtualNetworkOperationStatusResponse setConfiguration(NetworkSetConfigurationParameters parameters) throws InterruptedException, ExecutionException, ServiceException, IOException;
    
    /**
    * The Set Network Configuration operation asynchronously configures the
    * virtual network  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj157181.aspx for
    * more information)
    *
    * @param parameters The updated network configuration.
    * @return The response body contains the status of the specified
    * asynchronous operation, indicating whether it has succeeded, is
    * inprogress, or has failed. Note that this status is distinct from the
    * HTTP status code returned for the Get Operation Status operation itself.
    * If the asynchronous operation succeeded, the response body includes the
    * HTTP status code for the successful request.  If the asynchronous
    * operation failed, the response body includes the HTTP status code for
    * the failed request, and also includes error information regarding the
    * failure.
    */
    Future<VirtualNetworkOperationStatusResponse> setConfigurationAsync(NetworkSetConfigurationParameters parameters);
}
