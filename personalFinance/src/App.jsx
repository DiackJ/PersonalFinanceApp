import { useState } from 'react'
import { RouterProvider } from 'react-router-dom';
import router from './router';
import './App.css'

function App() {
  console.log("i am running vroom vroom")

  return (
    <RouterProvider router={router} />
  )
}

export default App
