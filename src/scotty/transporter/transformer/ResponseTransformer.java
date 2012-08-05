package scotty.transporter.transformer;

import scotty.model.Response;

/**
 * Transforms a response from the gateway to the application known Response
 * object.
 * 
 * @author flo
 * 
 */
public interface ResponseTransformer {
	/**
	 * Transforms a response from the gateway to the scotty known
	 * {@link Response} object.
	 * 
	 * @param response
	 *            response from gateway.
	 * @return Response obj.
	 */
	public Response transformResponse(String response);
}
