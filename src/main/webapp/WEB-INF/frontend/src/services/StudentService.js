import axios from "axios";

const REST_API_BASE_URL = 'http://localhost:8080/api/students';

// export const listStudents = () => axios.get(REST_API_BASE_URL);

// export const getStudentById = (studentId) => axios.get(REST_API_BASE_URL + '/' + studentId);

class StudentService {
    listStudents(){
        return axios.get(REST_API_BASE_URL);
    }

    getStudentById(studentId){
        return axios.get(REST_API_BASE_URL + '/' + studentId);
    }
}
export default new StudentService()