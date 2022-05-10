import 'bootstrap/dist/css/bootstrap.min.css';
import { useHistory, useParams } from 'react-router-dom';
import { useState } from 'react/cjs/react.development';
import airlineService from '../services/airline.service';

const EndPage = () => {

    const{feedbackId} = useParams();
    const [feedbackDescription , setFeedbackDescription] = useState('')
    const [rating , setRating] = useState('');

    const history = useHistory();
    const submitFeedback = (e) =>{
        e.preventDefault();
        
        const feedback = {feedbackDescription , rating};
        

        airlineService.createFeedback(feedback)
            .then(response => {
                console.log("FeedBack added successfully", response.data);
                setFeedbackDescription("")
                setRating("")
             history.goBack();
            })
            .catch(error => {
                console.log('something went wrong', error);
            })
        }

    
    

    return (
        <div className="maindiv">
        
            
        <div>
            <p1 class="text-center"><h1><b>Thank you for booking tickets with us. We hope to serve you again </b></h1> </p1>
        </div>
        <div>

          <div className="container">
          <form>
                <div className="form-group">
                    <input 
                        type="text" 
                        className="form-control col-4"
                        id="feedbackdescription"
                        value={feedbackDescription}
                        onChange={(e) => setFeedbackDescription(e.target.value)}
                        placeholder="PROVIDE FEEDBACK"
                    />

                </div>
                <div className="form-group">
                    <input 
                        type="text" 
                        className="form-control col-4"
                        id="rating"
                        value={rating}
                        onChange={(e) => setRating(e.target.value)}
                        placeholder="RATE BY 10"
                    />
                </div>
                <div >
                    <button onClick={(e)=>submitFeedback(e)}className="btn btn-primary">
                      SUBMIT</button>
                </div>
              </form>
          </div>

        </div>
        
        </div>

    );
}
 
export default EndPage;

