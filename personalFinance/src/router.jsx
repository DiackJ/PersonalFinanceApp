import { createBrowserRouter } from "react-router-dom";
import Root from './Root';

const router = createBrowserRouter ([
    {
        path: "/",
        element: <Root />,
        // pages
        children: [
            {
                path: "",
                element: <LoginForm />,
            },
        ],
    },
]);

export default router;