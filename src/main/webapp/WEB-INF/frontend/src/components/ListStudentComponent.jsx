import React, { useEffect, useState } from 'react';
import StudentService from '../services/StudentService';
import './ListStudentComponent.css';

function ListStudentComponent() {
    const [students, setStudents] = useState([]);
    const [searchId, setSearchId] = useState('');
    const [filteredStudents, setFilteredStudents] = useState([]);
    const [error, setError] = useState('');
    const [showFilter, setShowFilter] = useState(false); // State for showing the filter menu
    const [visibleColumns, setVisibleColumns] = useState([
        'Student ID', 'Age', 'Gender', 'Ethnicity', 
        'Parental Education', 'Parental Support', 'Weekly Study Time (hrs)', 
        'Absences', 'Tutoring?', 'Extracurricular?', 'Sports?', 
        'Music?', 'Volunteering?', 'GPA', 'Grade'
    ]); // Initially all columns are visible

    const allColumns = [
        'Student ID', 'Age', 'Gender', 'Ethnicity', 
        'Parental Education', 'Parental Support', 'Weekly Study Time (hrs)', 
        'Absences', 'Tutoring?', 'Extracurricular?', 'Sports?', 
        'Music?', 'Volunteering?', 'GPA', 'Grade'
    ];

    useEffect(() => {
        StudentService.listStudents().then((response) => {
            setStudents(response.data);
            setFilteredStudents(response.data); // Initialize with all students
        }).catch(error => {
            console.error(error);
            setError('Failed to load students.');
        });
    }, []);

    const handleSearch = () => {
        if (searchId) {
            StudentService.getStudentById(searchId).then(response => {
                if (response.data) {
                    setFilteredStudents([response.data]);
                    setError(''); // Clear error message if a student is found
                } else {
                    setFilteredStudents([]); // Clear the list if the ID is not found
                    setError('Student ID not found. Please try again.');
                }
            }).catch(error => {
                console.error("Error fetching student by ID", error);
                setFilteredStudents([]);
                setError('Student ID not found. Please try again.');
            });
        } else {
            setFilteredStudents(students); // Reset to show all students if search is cleared
            setError('');
        }
    };

    const handleShowAll = () => {
        setFilteredStudents(students);
        setSearchId(''); // Clear search input
        setError(''); // Clear any error messages
    };

    const toggleFilter = () => {
        setShowFilter(!showFilter);
    };

    const handleColumnToggle = (column) => {
        if (visibleColumns.includes(column)) {
            setVisibleColumns(visibleColumns.filter(col => col !== column));
        } else {
            setVisibleColumns([...visibleColumns, column]);
        }
    };

    return (
        <div className='container'>
            <h2 className='text-center'>List of Students</h2>

            <div className='search-container'>
                <input
                    type='text'
                    placeholder='Search by Student ID'
                    value={searchId}
                    onChange={(e) => setSearchId(e.target.value)}
                />
                <button onClick={handleSearch}>Search</button>
                <button onClick={handleShowAll}>Show All</button>
                <button id='filter-button' onClick={toggleFilter}>Filter Columns</button>
            </div>

            {showFilter && (
                <div className='filter-container'>
                    {allColumns.map((column, index) => (
                        <div 
                            key={index} 
                            className='filter-item'
                            onClick={() => handleColumnToggle(column)} // Click anywhere within the sector to toggle
                        >
                            <input
                                type='checkbox'
                                checked={visibleColumns.includes(column)}
                                onChange={() => handleColumnToggle(column)}
                                onClick={(e) => e.stopPropagation()} // Prevent the click event from toggling twice
                            />
                            <label id='filter-labels'>{column}</label>
                        </div>
                    ))}
                </div>
            )}

            {error && <div className='error-message'>{error}</div>}

            <div className='table-container'>
                <table className='table table-striped table-bordered'>
                    <thead>
                        <tr>
                            {visibleColumns.includes('Student ID') && <th>Student ID</th>}
                            {visibleColumns.includes('Age') && <th>Age</th>}
                            {visibleColumns.includes('Gender') && <th>Gender</th>}
                            {visibleColumns.includes('Ethnicity') && <th>Ethnicity</th>}
                            {visibleColumns.includes('Parental Education') && <th>Parental Education</th>}
                            {visibleColumns.includes('Parental Support') && <th>Parental Support</th>}
                            {visibleColumns.includes('Weekly Study Time (hrs)') && <th>Weekly Study Time (hrs)</th>}
                            {visibleColumns.includes('Absences') && <th>Absences</th>}
                            {visibleColumns.includes('Tutoring?') && <th>Tutoring?</th>}
                            {visibleColumns.includes('Extracurricular?') && <th>Extracurricular?</th>}
                            {visibleColumns.includes('Sports?') && <th>Sports?</th>}
                            {visibleColumns.includes('Music?') && <th>Music?</th>}
                            {visibleColumns.includes('Volunteering?') && <th>Volunteering?</th>}
                            {visibleColumns.includes('GPA') && <th>GPA</th>}
                            {visibleColumns.includes('Grade') && <th>Grade</th>}
                        </tr>
                    </thead>
                    <tbody>
                        {
                            filteredStudents.length > 0 ? filteredStudents.map(student =>
                                <tr key={student.id}>
                                    {visibleColumns.includes('Student ID') && <td>{student.id}</td>}
                                    {visibleColumns.includes('Age') && <td>{student.age}</td>}
                                    {visibleColumns.includes('Gender') && <td>{student.studentGender.gender}</td>}
                                    {visibleColumns.includes('Ethnicity') && <td>{student.studentEthnicity.ethnicity}</td>}
                                    {visibleColumns.includes('Parental Education') && <td>{student.parentalEducation.parentalEducation}</td>}
                                    {visibleColumns.includes('Parental Support') && <td>{student.parentalSupport.parentalSupport}</td>}
                                    {visibleColumns.includes('Weekly Study Time (hrs)') && <td>{student.studyTimeWeekly}</td>}
                                    {visibleColumns.includes('Absences') && <td>{student.absences}</td>}
                                    {visibleColumns.includes('Tutoring?') && <td>{student.studentTutoring.tutoringStatus}</td>}
                                    {visibleColumns.includes('Extracurricular?') && <td>{student.studentExtracurricular.extracurricular}</td>}
                                    {visibleColumns.includes('Sports?') && <td>{student.studentSports.sportsParticipation}</td>}
                                    {visibleColumns.includes('Music?') && <td>{student.studentMusic.musicParticipation}</td>}
                                    {visibleColumns.includes('Volunteering?') && <td>{student.studentVolunteering.volunteeringParticipation}</td>}
                                    {visibleColumns.includes('GPA') && <td>{student.gpa}</td>}
                                    {visibleColumns.includes('Grade') && <td>{student.studentGrade.gradeLetter}</td>}
                                </tr>
                            ) : <tr><td colSpan={visibleColumns.length}>No students found.</td></tr>
                        }
                    </tbody>
                </table>
            </div>
        </div>
    );
}

export default ListStudentComponent;
